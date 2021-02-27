<template>
  <v-app>
    <v-main>
      <v-container fluid tag="section">
        <v-row justify="center">
          <v-col cols="12" md="8">
            <v-card
                color="#FFFFFF"
                icon="mdi-account-outline"
                class="client-card"
            >
              <template #title>
                Edit Profile — <small class="text-body-1">Complete your profile</small>
              </template>

              <v-form>
                <v-container class="py-0">
                  <v-row>
                    <v-col cols="4" md="2">
                      <p class="body-2 blue-grey--text text--darken-1">Client Number</p>
                    </v-col>
                    <v-col cols="10" md="5">
                      <p class="body-2 blue-grey--text text--darken-1">{{ client.clientNumber }}</p>
                    </v-col>
                  </v-row>
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
                    <v-col cols="12">
                      <v-textarea
                          clearable
                          clear-icon="mdi-close-circle"
                          label="Health Condition"
                          v-model:value="client.healthCondition"
                          rows="5"
                      />
                    </v-col>

                    <v-col
                        cols="12"
                        class="text-right"
                    >
                      <v-btn
                          @click="save()"
                          color="success"
                          medium
                          min-width="150"
                      >
                        Save Profile
                      </v-btn>
                    </v-col>
                  </v-row>
                </v-container>
              </v-form>
            </v-card>
          </v-col>
        </v-row>
      </v-container>
    </v-main>
    <footer-component/>
  </v-app>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import Footer from '@/components/Footer.vue';
import {Client} from '@/types/Client';
import api from '@/infrastructure/api/clientApi';


@Component({
  components: {
    'footer-component': Footer,
  },
})
export default class MainPage extends Vue {

  // data

  private clientDefault: Client = {
    id: 0,
    clientNumber: '',
    name: '',
    email: '',
    healthCondition: '',
  };

  private client: Client = {...this.clientDefault};

  private async save() {
    await api.saveClient(this.client)
        .then((response) => {
          this.client = response;
        });
  }

}
</script>

<style lang="scss">



</style>
