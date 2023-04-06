<template>
  <q-page class="items-center justify-lg-between vertical-top" style="height: 100%; background-color: #deb2a9">
    <div class="row justify-end items-end"> 
    </div>
    <div class="row">
      <div class="col">
      </div>
    </div>
    <div class="row ">
      <div class="col">
      </div>
    </div>
  <course-component/>
    <div class="row justify-end items-end">
      <div class="col">
        <foter-component/>
      </div>
    </div>
  </q-page>
</template>

<script setup lang="ts">
import CourseComponent from 'src/components/CourseComponent.vue';
import FoterComponent from 'components/FoterComponent.vue';
</script>