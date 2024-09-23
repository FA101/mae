<script setup>
import { ref, onMounted, computed } from 'vue';
import Sidebar from '../../components/discente/Sidebar.vue';
import Header from '../../components/discente/Header.vue';
import SearchBar from '../../components/discente/SearchBar.vue';
import PrimaryButton from '../../components/discente/PrimaryButton.vue';
import DictionaryEntry from '../../components/discente/DictionaryEntry.vue';
// import { fetchEntries } from '../services/api';

const entries = ref([]);
const searchTerm = ref('');
const sortOption = ref('relevance');

// Função para buscar verbetes do backend
const fetchAndSetEntries = async () => {
const data = await fetchEntries(searchTerm.value);
entries.value = data;
};

// Atualiza o termo de busca
const setSearchTerm = (term) => {
searchTerm.value = term;
fetchAndSetEntries();
};

// Ordenação de verbetes
const sortedEntries = computed(() => {
if (sortOption.value === 'relevance') {
    return entries.value.sort((a, b) => b.upvotes - a.upvotes);
}
return entries.value.sort((a, b) => new Date(b.createdAt) - new Date(a.createdAt));
});

// Mudar a opção de ordenação
const sortByRelevance = () => (sortOption.value = 'relevance');
const sortByDate = () => (sortOption.value = 'date');

// Buscar os verbetes quando o componente é montado
onMounted(fetchAndSetEntries);
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
          </div>
      
          <div class="entries-list">
            <DictionaryEntry
              v-for="entry in sortedEntries"
              :key="entry.id"
              :entry="entry"
            />
          </div> -->
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
}

.dictionary-view {
  padding: 16px;
}
.sort-options {
  margin-bottom: 16px;
}
.entries-list {
  display: flex;
  flex-wrap: wrap;
  gap: 16px;
}
</style>
  