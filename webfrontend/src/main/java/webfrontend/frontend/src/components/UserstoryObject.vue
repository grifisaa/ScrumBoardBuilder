<template>
  <div :class="[userstory.pane==$parent.$options.name ? 'visible' : ' invisible']">
    <h4>
      {{userstory.title}}

      <i @click="$emit('delete-userstory', userstory.id)" class="fas fa-times"></i>
      <i class="fas fa-reply"></i>
    </h4>
    <div class="description">
      <p>{{userstory.description}}</p>
    </div>

  </div>
</template>

<script>
  export default {
    name: "UserstoryObject",
    props: {
      userstory: Object,
    },
  }
</script>

<style scoped>
.fas {
  float: right;
  margin-left: 2px;
  margin-right: 2px;
}
.visible {
  display: block;
  border: 1px solid black;
}
.invisible {
  display: none;
  border: none;
}
.description {
  max-width: 20%;
}
h4 {
  text-align: left;
  margin: 5px;
}
h5 {
  text-align: left;
  margin: 5px;
}
p {
  text-align: left;
  margin: 5px;
  max-width: 80%;
  word-wrap: break-word;
}
</style>