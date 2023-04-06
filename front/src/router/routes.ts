import { RouteRecordRaw } from 'vue-router';

const routes: RouteRecordRaw[] = [
  {
    path: '/',
    component: () => import('layouts/MainLayout.vue'),
    children: [
      { path: '', component: () => import('pages/IndexPage.vue') },
      { path: '/contact', component: () => import('pages/ContactPage.vue') },
      {path: '/about', component: () => import('pages/AboutPage.vue') },
      {path: '/courses', component: () => import('pages/CoursesPage.vue') },
      {path: '/prod', component: () => import('pages/ProductsPage.vue') },
      {path: '/test', component: () => import('pages/TestimonialsPage.vue') },
      {path: '/reg', component: () => import('pages/RegistrationPage.vue') },
      {path: '/subs', component: () => import('pages/SubscribePage.vue') }
    ],
  },

  // Always leave this as last one,
  // but you can also remove it
  {
    path: '/:catchAll(.*)*',
    component: () => import('pages/ErrorNotFound.vue'),
  },
];

export default routes;