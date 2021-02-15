<template>
  <v-app>
    <footer-component>
    </footer-component>
  </v-app>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import Footer from "@/components/Footer.vue";


@Component({
  components: {
    'footer-component': Footer,
  }
})
export default class MainPage extends Vue {}
</script>
