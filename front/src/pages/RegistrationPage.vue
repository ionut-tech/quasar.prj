<template>
    <div class="row justify-around items-center">
  <div class="q-pa-md ">
    <div class=" q-gutter-y-md"  
    style="max-width: 600px"
    >
      <q-card>
        <q-tabs
          v-model="tab"
          class="bg-secondary text-white"
          align="justify"
          narrow-indicator
        >
          <q-tab 
          name="login" 
          label="Autentificare" />
          <q-tab 
          name="register" 
          label="Creează cont" />
        </q-tabs>

        <q-separator />

        <q-tab-panels 
        v-model="tab" 
        animated 
        class="bg-red-1 text-center">
          
        <q-tab-panel name="login">
            <div class="text-h6">Autentificare</div>

            <div class="row q-pa-sm">
           <div class="col">
            <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="E-mail" />
            </div>

            <q-separator inset />

          
           <div class="col">
            <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="Parola" />

          </div>
         </div>
         
         <q-btn 
          color="secondary" 
          class="full-width" 
          label="Autentificare"/>

          </q-tab-panel>

          <q-tab-panel name="register">
            <div class="row q-mb-md text-h6 justify-center">Creează cont</div>
            <div class="row q-pa-sm">
           <div class="col">
            <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="Nume" />
            </div>

            <q-separator inset />

          
           <div class="col">
            <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="Prenume"/>

          </div>
         </div>
         
         <div class="q-pa-sm">
         <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="Parola" />
        </div>

        <div class="q-pa-sm">
            <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="Confirmă parola" />
          </div>
          
          <div class="q-pa-sm">
         <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="E-mail" />
        </div>

        <div class="q-pa-sm">
         <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="Adresa" />
        </div>

        <div class="q-pa-sm">
         <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="Telefon" />
        </div>

        <div class="row q-pa-sm">
           <div class="col">
            <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="Județ" />
            </div>

            <q-separator inset />

          
           <div class="col">
            <q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="Localitate" />
          
          </div>
         </div>

         <q-btn 
         color="secondary" 
         class="full-width" 
         label="Creează cont"/>
          </q-tab-panel>
        </q-tab-panels>
      </q-card>
      
      
    </div>
  </div>
  </div>
  <div class="row justify-end items-end">
      <div class="col">
        <foter-component/>
      </div>
    </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import FoterComponent from 'components/FoterComponent.vue';
const tab= ref('login');
const text = ref('')

</script>