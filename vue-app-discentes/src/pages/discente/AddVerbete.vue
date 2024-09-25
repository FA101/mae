<script setup>
import { ref } from 'vue'
import Sidebar from '../../components/discente/Sidebar.vue';
import Header from '../../components/discente/Header.vue';
import PrimaryButton from '../../components/discente/PrimaryButton.vue';
import PrimaryInput from '../../components/discente/PrimaryInput.vue';
import SecondaryButton from '../../components/discente/SecondaryButton.vue';

const titulo = ref('')
const descricao = ref('')

</script>


<template>
    <div class="home-layout">
      <Sidebar />
      <div class="main-content">
        <Header titulo="Adicionar Verbete" caminho="Home > Dicionário > Adicionar Verbete"/>
        <div class="add-verbete">
            <div class="inputs">
                <PrimaryInput
                    label="Verbete*"
                    type="titulo"
                    placeholder="Nome"
                    v-model:value="titulo"
                    id="verbete"
                />
                <PrimaryInput
                    label="Comentário*"
                    type="descricao"
                    placeholder="Descrição"
                    v-model:value="descricao"
                    id="comentario"
                />
            </div>

            <div class="buttons">
                <!-- TODO: Botões ainda sem função -->
                <PrimaryButton acao="Salvar"/>
                <SecondaryButton acao="Cancelar" />
            </div>
        </div>

        
      </div>
    </div>
  </template>
  
  
<style scoped>

.home-layout {
    display: flex;
  }
  

.main-content {
  flex: 1;
  display: flex;
  flex-direction: column;
  height: 100vh;
}

.add-verbete {
    padding: 30px;
    height: 80%;
    display: flex;
    flex-direction: column;

}

.inputs {
    width: 100%;
    height: 40%;
    display: flex;
    flex-direction: column;
    align-self: flex-start;
}

#verbete {
    margin-bottom: 20px;
    width: 20%
}

#comentario input {
    margin-bottom: 20px;
    width: 70%;
}

.buttons {
    width: 17%;
    display: flex;
    justify-content: space-between;
}

</style>
  