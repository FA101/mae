<template>
    <div class="search-bar">
      <input
        type="text"
        v-model="searchTerm"
        @input="updateSearch"
        placeholder="Buscar..."
      />
    </div>
  </template>
  
  <script setup>
  const searchTerm = ref('');
  
  const emit = defineEmits(['update:search']);
  
  const updateSearch = () => {
    emit('update:search', searchTerm.value);
  };
  </script>
  
  <style scoped>
  .search-bar {
    margin-bottom: 16px;
  }
  </style>
  