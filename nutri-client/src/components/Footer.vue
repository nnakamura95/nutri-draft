<template>
  <v-footer>
    <v-container>
      <v-row align-v="center">
        <v-col class="text-center"
               cols="6"
               md="auto">
          <div class="copyright text-center text-lg-left text-muted">
            © {{year}} Nutri
          </div>
        </v-col>

        <v-spacer class="hidden-sm-and-down" />

        <v-col cols="12"
               md="auto">
          <div class="body-1 font-weight-light pt-6 pt-md-0 text-center">
            <p>About <a href="#" class="font-weight-bold ml-1" target="_blank">Nutri</a></p>
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
