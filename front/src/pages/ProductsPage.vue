<template>
  <q-page class="items-center justify-lg-between vertical-top" style="height: 100%; background-color: #deb2a9">
    <div class="row justify-left items-end">
    <div class="col bg-secondary">
      <q-input
      v-model="search" 
      filled 
      type="search" 
      placeholder="Caută">
  <template v-slot:append>
    <q-icon name="search" />
  </template>
</q-input> 
  </div>
    </div>
    <div class="row justify-end items-end">
            <products-list/>
            
      <div class="col">
        <div class="q-pa-lg flex flex-center">
    <q-pagination
      v-model="current"
      :max="5"
      direction-links
      color="black"
    />
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

import ProductsList from 'components/ProductsList.vue';
import ProductsList2 from 'components/ProductsList2.vue'
import FoterComponent from 'components/FoterComponent.vue';
</script>