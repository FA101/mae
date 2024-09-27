<template>
    <div class="layout">
        <Menu>
            <h1><span>M A E</span> <span class="tipo">Docentes</span></h1>
        </Menu>
        <div>
            <section class="header-layout">
                <h2>Upload de Arquivos</h2>
                <span class='mapa'>Aula > Inserir Documentos</span>
                <div class="arrow"></div>
                <div class="perfil">
                    <span><img src="../public/perfil-de-usuario.png" width="30" alt="perfil"></span>
                    <span>Docente</span>
                </div>
            </section>
            <section class="body-layout">
                <span class="explicacao">Insira arquivos que deseja realizar upload no respectivo tópico da sua
                    aula</span>
                <label for="files" class="input-files">
                    <span>Inserir arquivos!</span>
                    <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 1024 1024">
                        <path fill="currentColor"
                            d="M400 317.7h73.9V656c0 4.4 3.6 8 8 8h60c4.4 0 8-3.6 8-8V317.7H624c6.7 0 10.4-7.7 6.3-12.9L518.3 163a8 8 0 0 0-12.6 0l-112 141.7c-4.1 5.3-.4 13 6.3 13M878 626h-60c-4.4 0-8 3.6-8 8v154H214V634c0-4.4-3.6-8-8-8h-60c-4.4 0-8 3.6-8 8v198c0 17.7 14.3 32 32 32h684c17.7 0 32-14.3 32-32V634c0-4.4-3.6-8-8-8" />
                    </svg>
                    <input type="file" id="files" multiple @change="handleFiles">
                </label>
                <div class="file-preview">
                    <div v-for="file in filesInput" :key="file.name" class="file-item">
                        <span>{{ file.name }}</span>
                    </div>
                </div>
                <div class="buttons" v-if="verifyFiles">
                    <button class="button-enviar" :click="functionSubmit">Enviar</button>
                </div>
            </section>
        </div>
    </div>
</template>

<script setup lang="ts">
import { ref, computed } from 'vue';

const filesInput = ref<{ name: string }[]>([]);

// Computed para verificar se existem arquivos
const verifyFiles = computed(() => filesInput.value.length > 0);

function handleFiles(event: Event) {
    const target = event.target as HTMLInputElement;
    if (target.files) {
        const fileArray = Array.from(target.files);
        filesInput.value = fileArray.map(file => ({
            name: file.name,
        }));
    }
}

async function functionSubmit() {
    const formData = new FormData();
    filesInput.value.forEach(file => {
        formData.append('files[]', file); // Adiciona os arquivos ao FormData
    });

    try {
        const response = await fetch('', {
            method: 'POST',
            body: formData,
        });

        if (!response.ok) {
            throw new Error('Falha no upload');
        }

        const result = await response.json();
        console.log('Upload realizado com sucesso:', result);
    } catch (error) {
        console.error('Erro ao enviar os arquivos:', error);
    }
}


</script>

<style>
menu h1 {
    display: flex;
    flex-direction: column;
    text-align: center;
    margin-top: 1em;
    font-size: 2.5em;
}

menu h1 .tipo {
    font-size: 0.7em;
}

.layout {
    display: grid;
    grid-template-columns: 25% 1fr;
    width: 100%;
    height: 100%;
}

menu {
    background-color: #ebe9e9;
    height: 100%;
    margin: 0;
    display: flex;
    justify-content: center;
}

.header-layout {
    position: relative;
}

.header-layout,
.body-layout {
    margin: 2.5em;
}

.body-layout {
    margin: 2.5em;
    display: flex;
    flex-direction: column;
    align-items: center;
}

.header-layout h2 {
    font-size: 2em;
}

.arrow {
    margin-top: 0.5em;
    width: 100%;
    background: #ebe9e9;
    height: 1px;
}

.mapa {
    margin-left: 5px;
}

#files {
    display: none;
}

.perfil {
    display: flex;
    align-items: center;
    background: #ebe9e9;
    width: fit-content;
    padding: 0.5em 1em 0 0.5em;
    gap: 0.5em;
    border-radius: 5%;
    position: absolute;
    top: 0;
    right: 0;
}

.input-files {
    background: #ebe9e9;
    width: fit-content;
    display: flex;
    flex-direction: column;
    align-items: center;
    font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
    border: 1px rgba(0, 0, 0, 0.185) solid;
    padding: 1em;
}

.body-layout .explicacao {
    font-size: 1em;
    color: gray;
    padding: 1em;
}

.input-files:hover {
    background: #ebe9e9dc;
}

.file-preview {
    display: flex;
    flex-direction: column;
    margin-top: 1em;
}

.file-item {
    margin: 10px 0;
}

.button-enviar {
    width: fit-content;
    background: rgb(123, 230, 90);
    border: none;
    font-weight: 700;
    position: absolute;
    border-radius: 10%;
    padding: 0.5em;
}

.buttons {
    display: flex;
    justify-content: center;
}
</style>
