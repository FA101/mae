<script setup>
import { ref } from 'vue'
import Sidebar from '../../components/discente/Sidebar.vue';
import Header from '../../components/discente/Header.vue';
import PrimaryButton from '../../components/discente/PrimaryButton.vue';
import PrimaryInput from '../../components/discente/PrimaryInput.vue';
import SecondaryButton from '../../components/discente/SecondaryButton.vue';
import axios from 'axios'

const titulo = ref('')
const descricaoVerbete = ref('')
const upvote = ref(0)
const downvote = ref(0)


// Função para incrementar o upvote
const incrementUpvote = () => {
  upvote.value++
}

// Função para incrementar o downvote
const incrementDownvote = () => {
  downvote.value++
}

// Função para salvar o verbete
const salvarVerbete = async () => {
  try {
    const verbete = {
      titulo: titulo.value,
      descricaoVerbete: descricaoVerbete.value,
      upvote: upvote.value,
      downvote: downvote.value
    };
    const response = await axios.post('http://localhost:8080/verbetes', verbete);
    console.log('Conteúdo salvo com sucesso:', response.data);
    // Você pode adicionar uma mensagem de sucesso ou redirecionar o usuário aqui
  } catch (error) {
    console.error('Erro ao salvar o conteúdo:', error);
    // Exiba uma mensagem de erro para o usuário
  }
}
// Função para cancelar e limpar os campos
const cancelar = () => {
  titulo.value = '';
  descricaoVerbete.value = '';
  upvote.value = 0;
  downvote.value = 0;
}
</script>


<template>
    <div class="home-layout">
      <Sidebar />
      <div class="main-content">
        <Header titulo="Adicionar Verbete" caminho="Home > Dicionário > Adicionar Verbete"/>
        <div class="add-verbete">
            <div class="inputs">
                <PrimaryInput
                    label="Titulo do verbete*"
                    type="descricao"
                    placeholder="Descrição"
                    v-model:value="descricaoVerbete"
                    id="comentario"
                />
                <div class="votes">
                <button @click="incrementUpvote">
                    <i class="fa-solid fa-thumbs-up"></i>
                </button>
                <span>{{ upvote }}</span>
                <button @click="incrementDownvote">
                    <i class="fa-solid fa-thumbs-down"></i>
                </button>
                <span>{{ downvote }}</span>
                </div>
            </div>

            <div class="buttons">
                <PrimaryButton acao="Salvar" @click="salvarVerbete"/>
                <SecondaryButton acao="Cancelar" @click="cancelar" />
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
.votes button {
  background: none;
  border: none;
  cursor: pointer;
  font-size: 24px;
  margin-right: 10px;
  color: #007bff; /* Cor azul para os ícones */
}

.votes button:hover {
  color: #0056b3; /* Cor mais escura ao passar o mouse */
}

.votes span {
  margin-right: 20px;
  font-size: 16px;
}
</style>
  