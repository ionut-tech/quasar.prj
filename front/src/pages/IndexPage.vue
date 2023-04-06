<template>
  <q-page class="items-center justify-lg-between vertical-top" style="height: 100%; background-color: #deb2a9">
    <div class="row justify-end items-end">
      <div class="col bg-white">
        <q-img src="eye.PNG" style="height: 350px;" fit="scale-down"/>
      </div>
    </div>
    <div class="row">
      <div class="col">
        <product-component/>
      </div>
    </div>
    <div class="row ">
      <div class="col">
        <testimonials-component class="fit"/>
      </div>
    </div>
    <div class="row justify-end items-end">
      <div class="col">
        <div class="row justify-around items-center">
          <div class="col-6 q-pa-xl"> 
            <p class="text-h2" 
            style="font-family: 'Lucida Calligraphy'; 
            color:white"> Let's chat!</p> 
            </div>
          <div class="col-6">
            <chat-component class="q-pa-sm fit"/>
          </div>
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

<script setup lang="ts">
import TestimonialsComponent from 'components/TestimonialsComponent.vue';
import ChatComponent from 'components/ChatComponent.vue';
import ProductComponent from 'components/ProductComponent.vue';
import FoterComponent from 'components/FoterComponent.vue';
</script>