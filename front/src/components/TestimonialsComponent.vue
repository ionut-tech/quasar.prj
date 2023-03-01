<template>
    <div>
    <q-carousel
      animated
      v-model="slide"
      navigation
      infinite
      :autoplay="autoplay"
      arrows
      control-color="secondary"
      transition-prev="slide-right"
      transition-next="slide-left"
      @mouseenter="autoplay = false"
      @mouseleave="autoplay = true"
    >
      <q-carousel-slide v-for="(group, idx) in testimonialGroups" :key="idx" :name="idx" img-src="leaf.png">
        <div class="row fit">
          <div v-for="testimonial in group" :key="testimonial.id" class="col-4 q-pa-sm">
            <q-card class="my-card q-pa-lg transparent" flat>
              <q-card-section>
                <div class="row no-wrap items-center">
                  <q-rating size="28px" v-model="testimonial.stars" :max="5" color="deb2a9" style="color: #deb2a9"/>
                  <span class="text-caption text-grey q-ml-sm q-pa-sm">{{ testimonial.stars }}</span>
                </div>
              </q-card-section>
              {{ testimonial.testimonial }}
              <q-card-section class="text-right">
                <p1>{{testimonial.customer}}</p1>
              </q-card-section>
            </q-card>

          </div>
        </div>
      </q-carousel-slide>
    </q-carousel>
  </div>
</template>
<script type="ts" setup>
import {computed, ref} from 'vue';

const slide = ref(1);
const autoplay = ref(true);
const randomText = 'Lorem Ipsum is  he printing and typesetting industry. Lorem Ipsum has been the industry\'s standard d simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, whe';
const testimonials = ref([
  {
    id: 1,
    customer: 'Mihai',
    stars: 3,
    testimonial: randomText
  },
  {
    id: 2,
    customer: 'Stefan',
    stars: 4,
    testimonial: randomText
  },
  {
    id: 3,
    customer: 'Maria',
    stars: 5,
    testimonial: randomText
  },
  {
    id: 4,
    customer: 'Attila',
    stars: 3,
    testimonial: randomText
  },
  {
    id: 5,
    customer: 'Petre',
    stars: 5,
    testimonial: randomText
  },
  {
    id: 6,
    customer: 'Gali',
    stars: 3,
    testimonial: randomText
  },
  
]);
const testimonialGroups = computed(() => {
  return groupArray(testimonials.value, 4);
});
function groupArray(array, num) {
  const group = [];

  for (let i = 0; i < array.length; i += num) {
    group.push(array.slice(i, i + num));
  }
  return group;
}

</script>
