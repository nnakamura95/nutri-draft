<template>
  <nav class="navbar navbar-vertical fixed-left navbar-expand-md navbar-light bg-secondary">
    <b-nav vertical>
      <b-nav-item v-b-hover href="#">Dashboard</b-nav-item>
      <b-nav-item href="#">Profile</b-nav-item>
      <b-nav-item href="#">Health Condition</b-nav-item>
    </b-nav>
    <>
    <hr class="my-3">
    <!--Heading-->
    <h6 class="navbar-heading text-muted">Documentation</h6>
  </nav>
</template>

<script lang="ts">
import {Component, Vue} from 'vue-property-decorator';

@Component
export default class SideBar extends Vue {

}
</script>

<style scoped>

</style>
