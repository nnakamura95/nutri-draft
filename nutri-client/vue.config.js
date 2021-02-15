module.exports = {
  transpileDependencies: [
    'vuetify'
  ],
  devServer: {
    port: 18080,
    proxy: 'http://localhost:28080'
  }
}
