<template>
  <h3>In Progress</h3>
  <div class="insidePain">
    <div class="insideDiv" :key="userstory.title" v-for="userstory in userStory">
      <UserstoryObject @delete-userstory="$emit('delete-userstory', userstory.id)" :userstory="userstory"/>
    </div>
  </div>


</template>

<script>
import UserstoryObject from "./UserstoryObject";

export default {
  name: "paneInProgress",
  props: {
    userStory: Array,
  },
  components: {
    UserstoryObject
  },
  emits: ['delete-userstory'],
}
</script>

<style scoped>
.insideDiv {
  margin: 5px;
  text-align: center;
  min-width: 96%;
}
.insidePain {
  overflow-y: scroll;
  min-height: 500px;
  max-height: 500px;
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