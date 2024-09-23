<script setup>
</script>


<template>
    <div style="background-color: red;" class="sidebar">
      <div style="background-color: blue;">
          <div class="logo">
            <h1>M A E <br> Discentes</h1>
          </div>
          <ul>
            <li><a href="#">Dicionário</a></li>
            <li><a href="#">Feedback</a></li>
          </ul>
      </div>
      <div class="settings">
        <a href="#">
          <span>Configurações</span>
          <i class="icon-settings"></i>
        </a>
      </div>
    </div>
  </template>
  
  
  <style scoped>
  .sidebar {
    background-color: #EBE9E9;
    width: 200px;
    padding: 20px;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
  }
  
  .logo h1 {
    font-size: 1.5rem;
    font-weight: bold;
    margin-bottom: 40px;
  }
  
  ul {
    list-style: none;
    padding: 0;
  }
  
  ul li {
    background-color: yellow;
    padding: 7px;
    margin-bottom: 15px;
    border-radius: 10px;
  }
  
  ul li a {
    text-decoration: none;
    color: black;
  }
  
  .settings {
    display: flex;
    align-items: center;
  }
  
  .settings a {
    display: flex;
    align-items: center;
    text-decoration: none;
    color: black;
  }
  
  .icon-settings {
    margin-left: 5px;
  }
  </style>
  