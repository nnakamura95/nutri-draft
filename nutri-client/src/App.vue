<template>
  <div id="app">
<!--    <div id="nav">-->
<!--      <router-link to="/">Home</router-link> |-->
<!--      <router-link to="/about">About</router-link>-->
<!--    </div>-->
    <router-view/>
    <div class="footer">
      <p>Copyright © Nutri</p>
    </div>
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

.footer {
  float: left;
  width: auto;
  padding: 15px;
}

@import url('https://fonts.googleapis.com/css?family=M+PLUS+1p&display=swap');
 .footer p {
  display: table-cell;
  width: 100%;
  text-align: center;
  font-family: 'M PLUS 1p';
}
/*#nav a {*/
/*  font-weight: bold;*/
/*  color: #2c3e50;*/
/*}*/

/*#nav a.router-link-exact-active {*/
/*  color: #42b983;*/
/*}*/
</style>
