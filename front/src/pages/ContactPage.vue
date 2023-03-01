<template v-slot:default>
  <q-page class="items-center justify-lg-between vertical-top" style="height: 100%; background-color: #deb2a9">

    <div class="row justify-end items-end">
      <div class="col">
        
        <div class="row justify-around items-center">
          <div class="col-6 q-pa-xl"> 
 
    <div>
      <q-card class="my-chat">
        <q-card-section class="bg-grey-4">
          Contact us!
          <p>Please fill this form in a decent manner</p>
        </q-card-section>
        <q-card-section>
		
          <q-input
            v-model="ph"
            placeholder="Nume"
            :dense="dense"/>

          <q-input
            v-model="ph"
            placeholder="E-mail"
            :dense="dense"/>

          <q-input
            v-model="ph"
            placeholder="Telefon"
            :dense="dense"/>
        </q-card-section>

        <q-separator/>
		
        <div class="q-pa-md"
             style="max-width: 490px">
          <q-input
            v-model="text"
            filled
            type="textarea"
            placeholder="Mesaj..."
            bg-color="grey-4"
          />
        </div>
        <q-card>
          <q-btn color="grey-9" class="full-width" label="Trimite"/>
        </q-card>
      </q-card>
        </div>
  </div>
            </div>
          <div class="col-6">
            <chat-component class="q-pa-sm fit"/>
          </div>
        </div>
      </div>
    
    <div class="row justify-end items-end">
      <div class="col">
        <foter-component/>
      </div>
    </div>
  </q-page>
</template>

<script>
import FoterComponent from 'src/components/FoterComponent.vue';
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
