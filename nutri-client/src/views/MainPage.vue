<template>
  <v-app>
    <v-main>
      <v-container fluid>
        <v-row justify="center">
          <v-col cols="12" md="8">
            <v-card
                color="transparent"
                icon="mdi-account-outline"
                outlined
            >
              <template #title>
                Edit Profile — <small class="text-body-1">Complete your profile</small>
              </template>

              <v-form>
                <v-container class="py-0">
                  <v-row>
                    <v-col
                        cols="12"
                        sm="4"
                    >
                      <v-text-field
                          v-model:value="client.name"
                          label="Name"
                      />
                    </v-col>

                    <v-col
                        cols="12"
                        sm="4"
                    >
                      <v-text-field
                          v-model:value="client.email"
                          label="E-mail"
                      />
                    </v-col>
                  </v-row>
                  <v-row>
                    <v-col
                        cols="15"
                        sm="4"
                    >
                      <v-textarea
                          clearable
                          clear-icon="mdi-close-circle"
                          label="Enter health condition"
                          v-model:value="client.healthCondition"
                      />
                    </v-col>
                  </v-row>
                </v-container>
              </v-form>
            </v-card>
          </v-col>
        </v-row>
      </v-container>

      <footer-component/>
    </v-main>
  </v-app>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import Footer from '@/components/Footer.vue';
import {Client} from '@/types/Client';


@Component({
  components: {
    'footer-component': Footer,
  }
})
export default class MainPage extends Vue {

  // data

  private client: Client = {
    id: 0,
    clientNumber: '',
    name: '',
    email: '',
    healthCondition: '',
  }

  private healthCondition: string = '';

}
</script>
