<template>
      <q-page 
      class="window-height row justify-center items-center bg-white" 
      style="height: 100%; 
      background-color: #deb2a9">
      <div class="row-2 align-center">
<h4 align-center>Abonează-te acum!</h4>
Pentru a primi vești despre noile oferte te rugăm să introduci adresa ta de e-mail mai jos        
<q-card separator />
<q-card>
<div class="q-pa-sm">

<q-input 
            standout="bg-secondary text-white" 
            v-model="text" 
            label="E-mail" />
        </div>
        <q-btn 
        color="secondary" 
        class="full-width" 
        label="Trimite"/>
      </q-card>
    <div class=" q-gutter-y-md" style="max-width: 600px">
        <div class="row justify-end items-end">
      <div class="col">
      </div>
    </div>
    </div>
    </div>
    </q-page>
    
    <foter-component/>
</template>

<script>
import FoterComponent from 'components/FoterComponent.vue';
export default {
  components: {
    FoterComponent: FoterComponent
  },
  setup() {
    return {
      lorem: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.'
    }
  }
}
</script>