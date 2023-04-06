<template>
  <div class="q-pa-md">
    <div class="q-pa-md q-gutter-md row justify-left items-start">
      <q-card
      style="height: 300px;
      max-width: 200px; width: 100%;">
        <q-card-section>
        <q-img
        src="img.3.PNG"
        :ratio="1"
        height="200px"
                />
        </q-card-section>

        <q-card-actions align="center">
          <q-btn
          color="secondary" 
          label="Vezi detalii"
          href="/prod#/prod"
          />
        </q-card-actions>
      </q-card>

      <q-card
      style="height: 300px;
      width: 200px">
        <q-card-section>
        <q-img
          src="eye-3.JPG"
          :ratio="1"
          height="200px"
        />

        </q-card-section>

        <q-card-actions align="center">
          <div class="justify-content-center">
          <q-btn 
          color="secondary"
          label="Vezi detalii"
          href="/prod#/prod"
          />
        </div>
        </q-card-actions>
</q-card>
<div class="q-pa-md row items-start q-gutter-md">
      <q-card-section 
      class="q-pt-none"
      color="secondary">
        <div class="text-subtitle1">
        </div>
        <div class="text-caption text-secondary">
        </div>
      </q-card-section>
      <q-img
          src="message.PNG"
          :ratio="1"
          height="210px"
          width="270px"
        />
      
      <q-separator inset />
      
    </div>
    </div>
  </div>
</template>