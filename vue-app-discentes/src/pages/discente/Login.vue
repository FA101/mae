<template>
    <div class="login-container">
      <h1>MAE Discentes</h1>
      <form @submit.prevent="submitForm">
        <h2>Login</h2>
        <LoginInput
          label=""
          type="email"
          placeholder="Email"
          v-model:value="email"
        />
        <LoginInput
          label=""
          type="password"
          placeholder="Senha"
          v-model:value="password"
        />
        <div class="extra-options">
          <a href="#">Esqueci minha senha</a>
        </div>
        <button type="submit" @click="handleLogin">Entrar</button>
      </form>
      <div class="create-account">
        <a href="#">Criar conta</a>
      </div>
    </div>
  </template>
  
  <script setup>
  import { ref } from 'vue';
  import { useRouter } from 'vue-router';
  import LoginInput from '../../components/discente/LoginInput.vue';
  
  const email = ref('');
  const password = ref('');
  const router = useRouter();
  
  const handleLogin = () => {
    // Lógica de autenticação aqui (exemplo)
    if (email.value === 'aluno@example.com' && password.value === '123456') {
      router.push('/home'); // Redireciona para a Home se o login for bem-sucedido
    } else {
      alert('Credenciais incorretas');
    }
  };
  </script>
  
  <style scoped>
  .login-container {
    margin-top: 7%;
    background-color: #EBE9E9;
    width: 25%;
    padding: 50px;
    align-self: center;
    border-radius: 40px;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  }
  
  h1 {
    text-align: center;
    margin-bottom: 20px;
  }

  h2 {
    margin-left: 10%;
    margin-bottom: 2%;
    text-align: start;
  }
  
  form {
    display: flex;
    flex-direction: column;
  }
  
  button {
    background-color: #63676C;
    color: white;
    font-weight: bold;
    padding: 10px;
    border: none;
    border-radius: 5px;
    margin-top: 10px;
    cursor: pointer;
    width: 80%;
    align-self: center;
  }
  
  button:hover {
    background-color: #4a4a4a;
  }
  
  .extra-options  {
    margin-bottom: 20px;
    margin-right: 42px;
    text-align: end;
    font-size: 15px;
  }

  .create-account{
    margin-top: 10px;;
    text-align: center;
    font-size: 15px;
  }
  
  .extra-options a, .create-account a {
    color: #000000;
    text-decoration: underline;
  }
  
  .extra-options a:hover, .create-account a:hover {
    text-decoration: underline;
  }
  </style>