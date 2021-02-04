<template>
  <div class="main-box" content="width=device-width" align-v="center">
    <div class="nav-box">
      <div class="box1">
        <div class="site">
          <h1><a href="#">Nutri</a></h1>
        </div>
      </div>
      <div class="box2">
        <nav class="menu">
          <ul>
            <li><a href="#">Account</a></li>
            <li><a href="#">Login</a></li>
            <li><a href="#">Signup</a></li>
          </ul>
        </nav>
      </div>
    </div>
    <div class="boxA">
      <div class="box3">
        <aside class="aside-menu">
          <ul>
            <li><a href="#">Dashboard</a></li>
            <li><a href="#">Profile</a></li>
            <li><a href="#">Health Condition</a></li>
          </ul>
        </aside>
<!--        <nav class="navbar navbar-vertical fixed-left navbar-expand-md navbar-light bg-white" id="sidenav-main">-->
<!--          <div class="container-fluid">-->
<!--            <template>-->
<!--              Account-->
<!--            </template>-->
<!--          </div>-->
<!--        </nav>-->
      </div>
      <div class="box4">
        <div class="text-area-box">
          <b-form-textarea
              id="textarea"
              v-model:value="healthCondition"
              placeholder="Enter health condition..."
              rows="5"
          ></b-form-textarea>
        </div>
      </div>
      <div class="box5">
        BOX5
      </div>
    </div>
    <div class="box6">
      BOX6
    </div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';


@Component
export default class Nutri extends Vue {
  private healthCondition: string = '';

}
</script>

<style lang="scss" scoped>

#textarea {
  resize: none;
}

.site h1 a {
  color: #ffffff;
  text-decoration: none;
}

.site h1 {
  text-align: left;
  margin: 0;
  font-size: 30px;
}

.menu ul {
  margin: 0;
  padding: 0;
  list-style: none
}

.menu li a {
  display: block;
  padding: 10px;
  color: #ffffff;
  font-size: 14px;
  text-decoration: none;
}

.menu li a:hover {
  background-color: #808080;
}

.menu ul:after {
  content: "";
  display: block;
  clear: both;
}

.menu li {
  float: left;
  width: auto;
}

//side menu
.aside-menu ul {
  margin: 0;
  padding: 0;
  list-style: none;
}

.aside-menu li a {
  display: block;
  padding: 5px;
  color: #000000;
  font-size: 14px;
  text-decoration: none;
}

.aside-menu li a:hover {
  background-color: #eeeeee;
}

//global nav bar background color
.nav-box {
  background-color: #333333;
}

@media (min-width: 768px) {

  .nav-box:after {
    content: "";
    display: block;
    clear: both;
  }

  .nav-box {
    padding-top: 20px;
    padding-bottom: 10px;
  }


  .box1 {
    float: left;
    width: auto;
  }

  .box2 {
    float: right;
    width: auto;
  }

  /*//setting to set if side-by-side*/
  .boxA:after {
    //float: left;
    content: "";
    display: block;
    clear: both;
  }

  .box3 {
    background-color: #f5fffa;
    float: left;
    width: 10%;
  }

  .box4 {
    float: left;
    width: 70%;
  }

  .box5 {
    float: left;
    width: 20%;

  }
}

.nav-box, .box5, .box6 {
  padding-left: 15px;
  padding-right: 15px;
}

.nav-box {
  padding-top: 10px;
  padding-bottom: 10px
}

.box5, .box6 {
  padding-top: 15px;
  padding-bottom: 15px;
}
</style>
