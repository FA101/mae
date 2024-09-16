<template>
    <div class="login-container">
      <h1>MAE Discentes</h1>
      <form @submit.prevent="submitForm">
        <LoginInput
          label="Email"
          type="email"
          placeholder="Email"
          v-model:value="email"
        />
        <LoginInput
          label="Senha"
          type="password"
          placeholder="Senha"
          v-model:value="password"
        />
        <div class="extra-options">
          <a href="#">Esqueci minha senha</a>
        </div>
        <button type="submit">Entrar</button>
      </form>
      <div class="create-account">
        <a href="#">Criar conta</a>
      </div>
    </div>
  </template>
  
  <script setup>
  import { ref } from 'vue';
  import LoginInput from './LoginInput.vue';
  
  const email = ref('');
  const password = ref('');
  
  const submitForm = () => {
    console.log('Email:', email.value);
    console.log('Password:', password.value);
  };
  </script>
  
  <style scoped>
  .login-container {
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
  