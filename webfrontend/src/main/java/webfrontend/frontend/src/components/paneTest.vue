<template>
  <h3>Test</h3>
  <div class="insideDiv">
    <h4>temp9</h4>
    <h5>description9</h5>
  </div>
  <div class="insideDiv">
    <h4>temp10</h4>
    <h5>description10</h5>
  </div>
</template>

<script>
export default {
  name: "paneTest"
}
</script>

<style scoped>
.insideDiv {
  border: 1px solid black;
  margin: 5px;
  text-align: center;
  min-width: 96%;
}
h4 {
  text-align: left;
  margin: 5px;
}
h5 {
  text-align: left;
  margin: 5px;
}
</style>