import axios from 'axios';

const api = axios.create({
  baseURL: 'localhost:8080', // URL do seu backend
});

// Função para buscar verbetes
export const fetchEntries = async (searchTerm = '') => {
  const response = await api.get('/verbetes', { params: { q: searchTerm } });
  return response.data;
};