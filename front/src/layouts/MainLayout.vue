Layout Builder
Visible Header
Visible Footer
Visible left-side Drawer
Visible right-side Drawer
Inject Drawer content for scrolling
Quasar
<template>
  <q-layout view="lHh lpR lFf">

    <q-header class="text-black" style="width: 100%; background-color: #deb2a9">
      <div class="row">
        <div class="col-2"></div>
        <div class="col-8">
          <q-toolbar class="bg-white">
            <main-menu class="fit"/>
          </q-toolbar>
        </div>
        <div class="col-2"></div>
      </div>

    </q-header>

    <q-page-container>
      <div class="row" style="background-color: #deb2a9; width: 100%">
        <div class="col-2"></div>
        <div class="col-8 bg-white">
          <router-view/>
        </div>
      </div>

    </q-page-container>
  </q-layout>
</template>
<script>
import MainMenu from '../components/MainMenu.vue';

export default {
  components: {MainMenu}
}
</script>
