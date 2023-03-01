<template>
  <div>
    <div class="row">
      <div class="col-9"></div>
      <div class="col-3 justify-end">
        <div>
          <q-btn-group 
          class="content-center fit justify-center" 
          flat>
            <q-btn 
            label="Abonare"
            to="/subs"
            />
            <q-separator 
            vertical inset/>
            <q-btn 
            label="Log In"
            to="/reg" 
            icon="person"/>
          </q-btn-group>
        </div>
      </div>

      <div class="col-1"></div>
      <div class="col-2">
        <q-img 
        src="Logo.PNG" 
        to="/reg"
        style="height: 50px" 
        fit="scale-down"/>
      </div>
      <div 
      class="col-8 items-center" 
      fit>
        <q-btn-group
        flat
        spread
        class="absolute"
        style="bottom: 0;
        width: 60%">
        <q-btn
        flat
        v-for="item in menuItems"
        :key="item.name"
        :label="item.name"
        :to="item.link"
        no-caps
        padding="none"
        rounded
        style="font-family: 'Verdana'"/>
        </q-btn-group>
      </div>
      <div class="col-3">
      </div>
    </div>
    <div class="row">
      <div class="col-1"></div>
      <div class="col-9">
        <q-separator color="black" size="1px"/>
      </div>

    </div>
  </div>
</template>

<script setup lang="ts">
const menuItems = [
  {name: 'Acasa', icon: 'timeline', link: '/'},
  {name: 'Despre', icon: 'microphone', link: '/about'},
  {name: 'Produse', icon: 'timeline', link: 'prod'},
  {name: 'Cursuri', icon: 'timeline', link: '/courses'},
  {name: 'Testimoniale', icon: 'timeline', link: 'test'},
  {name: 'Contact', icon: 'timeline', link: '/contact'}]
</script>
