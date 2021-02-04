import Vue from 'vue';
import VueRouter, { RouteConfig } from 'vue-router';
import Nutri from '../views/Nutri.vue';
import MainPage from '@/views/MainPage.vue';

Vue.use(VueRouter);

const routes: RouteConfig[] = [
  {
    path: '/',
    name: 'Nutri',
    component: Nutri,
  },
  {
    path: '/MainPage',
    name: 'MainPage',
    component: MainPage,
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue'),
  },
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes,
});

export default router;
