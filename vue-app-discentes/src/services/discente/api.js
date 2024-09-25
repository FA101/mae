import axios from 'axios';

const api = axios.create({
  baseURL: 'http://127.0.0.1:8080', // URL do seu backend
});

// Função para buscar verbetes
export const fetchEntries = async () => {
  const response = await api.get('/verbetes');
  return response.data;
};