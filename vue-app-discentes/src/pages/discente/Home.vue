<script setup>
import Sidebar from '../../components/discente/Sidebar.vue';
import Header from '../../components/discente/Header.vue';
import HomeContent from '../../components/discente/HomeContent.vue';
</script>


<template>
    <div class="home-layout">
      <Sidebar />
      <div class="main-content">
        <Header titulo="Home" caminho="Home"/>
        <HomeContent />
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
  </style>
  