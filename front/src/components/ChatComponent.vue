<template>
  <div class="q-gutter-md fit" style="max-width: 550px">
    <q-card class="my-card q-pa-none">
      <q-card-section class="q-pt-none q-pb-none">
        <div class="row">
          <div class="col-3">
            <q-icon name="favorite_border" color="secondary" class="fit" size="4em"/>
          </div>
          <div class="col-9">
            <q-input
              v-model="ph"
              placeholder="Nume"
              :dense="dense"
            />

            <q-input
              v-model="ph"
              placeholder="E-mail"
              :dense="dense"
            />
            <q-input
              v-model="ph"
              placeholder="Telefon"
              :dense="dense"/>
          </div>
        </div>

      </q-card-section>
      <q-card-section class="q-pb-none">
          <q-input
            v-model="text"
            filled
            type="textarea"
            placeholder="Mesajul..."
            bg-color="secondary"
            class="fit"
          />
      </q-card-section>
        <div class="row justify-end q-pa-sm" >
          <div class="col-10"></div>
          <div class="col-2">
            <q-btn color="black"
            label="Trimite"
            :dense="dense"/>
          </div>
        </div>

    </q-card>
  </div>
</template>

<script type="ts" setup>
import {ref} from 'vue';

let dense = ref(true);
</script>

<style lang="sass" scoped>
.my-card
  width: 100%
  max-width: 400px
  height: 100%
</style>

