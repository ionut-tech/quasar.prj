import { createApp } from 'vue'
import { createPinia} from 'pinia'
import App from './App.vue'
import Vue from "vue";
import VueSocial from "@growthbunker/vuesocial";

Vue.use(VueSocial);
const app = createApp(App)

app.use(createPinia())

app.mount('#app')