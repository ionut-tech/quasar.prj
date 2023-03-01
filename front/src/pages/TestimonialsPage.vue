<template>
  <q-page class="items-center justify-lg-between vertical-top" style="height: 100%; background-color: #deb2a9">
    <div class="row ">
      <div class="col">
        <testimonials-component class="fit"/>
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
import FoterComponent from 'components/FoterComponent.vue';
</script>