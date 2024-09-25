<script setup>
  import { useRouter } from 'vue-router';
import { ref, onMounted, computed } from 'vue';
import Sidebar from '../../components/discente/Sidebar.vue';
import Header from '../../components/discente/Header.vue';
import SearchBar from '../../components/discente/SearchBar.vue';
import PrimaryButton from '../../components/discente/PrimaryButton.vue';
import DictionaryEntry from '../../components/discente/DictionaryEntry.vue';

const entry = ref({
  id: 0, 
  title: 'Verbete 1',
  topComment: 'Lorem Ipsum alguma coisa, algo para teste',
  upvotes: 15,
  downvotes: 3
})


</script>


<template>
    <div class="home-layout">
      <Sidebar />
      <div class="main-content">
        <Header titulo="Dicionário" caminho="Home > Dicionário"/>
        <div class="dictionary-view">
          <div class="search-action">
            <SearchBar @update:search="setSearchTerm" />
            <PrimaryButton acao="Adicionar Verbete"/>
          </div>
          <!-- <div class="sort-options">
            <button @click="sortByRelevance">Relevância</button>
          </div>  -->
      
          <div class="entries-list">
            <DictionaryEntry />
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

.search-action {
  padding: 20px;
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  margin-bottom: 50px;
}

.dictionary-view {
  padding: 16px;
}
.sort-options {
  margin-bottom: 16px;
}
.entries-list {
  padding: 0px 30px;
  display: flex;
  flex-wrap: wrap;
  gap: 16px;
}
</style>
  