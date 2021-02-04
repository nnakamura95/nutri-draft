<template>
  <div>
    <side-bar></side-bar>
    <div class="main-content">
      <nav-bar></nav-bar>
      <footer-component></footer-component>
    </div>
  </div>
</template>

<script lang="ts">
import {Component, Vue} from 'vue-property-decorator';
import SideBar from '@/components/SideBar.vue';
import NavBar from '@/components/NavBar.vue';
import Footer from '@/components/Footer.vue';

@Component({
  components: {
    'side-bar': SideBar,
    'nav-bar': NavBar,
    'footer-component': Footer
  }
})
export default class MainPage extends Vue {

}
</script>

<style lang="scss" scoped>
.main-content {
  background-color: #dddddd;
}

</style>
