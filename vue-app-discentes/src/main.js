import './assets/discente/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import Home from './pages/discente/Home.vue';
import Login from './pages/discente/Login.vue';
import { createRouter, createWebHistory } from 'vue-router';

const routes = [
    { path: '/', component: Login },
    { path: '/home', component: Home },
  ];
  
  const router = createRouter({
    history: createWebHistory(),
    routes,
  });

createApp(App).mount('#app')



const app = createApp(App);
app.use(router);
app.mount('#app');
