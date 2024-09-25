import './assets/discente/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import Home from './pages/discente/Home.vue';
import Login from './pages/discente/Login.vue';
import Dictionary from './pages/discente/Dictionary.vue';
import { createRouter, createWebHistory } from 'vue-router';
import AddVerbete from './pages/discente/AddVerbete.vue';

const routes = [
    { path: '/', name: 'Login', component: Login },
    { path: '/home', name: 'Home', component: Home },
    { path: '/dictionary', name: 'Dictionary', component: Dictionary },
    { path:'/addVerbete', name: 'AddVerbete', component: AddVerbete}
  ];
  
  const router = createRouter({
    history: createWebHistory(),
    routes,
  });

createApp(App).mount('#app')



const app = createApp(App);
app.use(router);
app.mount('#app');
