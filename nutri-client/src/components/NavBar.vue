<template>
  <v-app-bar app absolute color="transparent" :clipped-left="$vuetify.rtl">
    <v-spacer />
    <v-btn rounded color="primary">Login</v-btn>
    <v-btn rounded color="primary">Logout</v-btn>
    <v-btn rounded color="primary">Signup</v-btn>
  </v-app-bar>
</template>

<script lang="ts">
import {Component, Vue} from 'vue-property-decorator';

@Component
export default class NavBar extends Vue {

}
</script>

<style scoped>

</style>
