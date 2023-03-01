<template>
  <div class="bg-white">
    <q-toolbar>

      <div class="q-pa-md">
        <div class="text-purple q-gutter-md .btn-floating">
          
          <q-icon 
          color="primary" 
          href="facebook.com" 
          v-for="size in ['lg']" 
          :key="size" 
          :size="size" 
          name="facebook" />

          <q-icon 
          color="primary" 
          href="facebook.com" 
          v-for="size in ['lg']" 
          :key="size" 
          :size="size" 
          name="fa-brands fa-instagram" />
          
        </div>
      </div>
    </q-toolbar>
    <q-tabs>
      <div class="col-2">
      <q-tab name="Contactează-ne" label="Contactează-ne" />
     
</div>
      <q-tab name="Informații" label="Informații" link="AboutPage.vue"/>
      <q-tab name="Asitență" label="Asistență" />
      <q-tab name="Cont client" label="Cont client" />
      <q-tab name="Plată" label="Plată" />
      
    </q-tabs>
  
  </div>
</template>