<template>
      <input
        type="text"
        v-model="searchTerm"
        @input="updateSearch"
        placeholder="Buscar..."
      />
  </template>
  
  <script setup>
  // const searchTerm = ref('');
  
  // const emit = defineEmits(['update:search']);
  
  // const updateSearch = () => {
  //   emit('update:search', searchTerm.value);
  // };
  </script>
  
  <style scoped>
  input {
    background-color: #EBE9E9;
    color: #63676C;
    border: none;
    width: 70%;
    padding: 10px;
    border-radius: 10px;
  }
  </style>
  