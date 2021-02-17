<template>
  <v-footer
      id="default-footer"
      color="transparent"
      absolute
      app
      inset>
    <v-container>
      <v-row align="center">
        <v-col
            v-for="(link, i) in links"
            :key="i"
            class="text-center"
            sm="auto"
        >
          <a
              :href="link.href"
              class="text-decoration-none text-uppercase text-caption font-weight-regular"
              target="_blank"
              v-text="link.text"
          />
        </v-col>

        <v-spacer class="hidden-sm-and-down" />

        <v-col cols="12"
               sm="auto">
          <div class="body-1 font-weight-light pt-6 pt-md-0 text-center">
            © {{year}} Nutri, {{ space }} Made by <a href="#" class="text-decoration-none" target="_blank">Nutri</a>
          </div>
        </v-col>
      </v-row>
    </v-container>
  </v-footer>

</template>

<script lang="ts">
import {Component, Vue} from 'vue-property-decorator';

@Component
export default class Footer extends Vue {

  // data

  space: string = '';

  links: any = [
    {
      href: '#',
      text: 'About Us',
    },
    {
      href: '#',
      text: 'Blog',
    },
    {
      href: '#',
      text: 'Licenses',
    },
  ];

  year: any = new Date().getFullYear();

}
</script>

<style lang="scss">
a {
  text-decoration: none !important;
  color: inherit !important;
  cursor: pointer;
}


</style>
