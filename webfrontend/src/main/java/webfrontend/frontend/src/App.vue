<template>
  <div class="container">
    <h1 id="scrumHead">Scrum Board</h1>
    <div class="paneContainer">
      <pane-project-backlog  />
    </div>
    <div class="paneContainer">
      <pane-sprint-backlog/>
    </div>
    <div class="paneContainer">
      <pane-in-progress />
    </div>
    <div class="paneContainer">
      <pane-ready/>
    </div>
    <div class="paneContainer">
      <pane-test/>
    </div>
    <div class="paneContainer">
      <pane-done/>
    </div>

  </div>

</template>

<script>
import paneProjectBacklog from "@/components/paneProjectBacklog";
import paneSprintBacklog from "@/components/paneSprintBacklog";
import paneInProgress from "@/components/paneInProgress";
import paneReady from "@/components/paneReady";
import paneTest from "@/components/paneTest";
import paneDone from "@/components/paneDone";
export default {
  name: 'App',
  components: {
    paneProjectBacklog,
    paneSprintBacklog,
    paneInProgress,
    paneReady,
    paneTest,
    paneDone,
  },
  data() {
    return {
      UserStory: [],
    }
  },
  created() {
    this.UserStory = [
        <userStory title="test1" description="short desc" acceptanceCriteria="test acceptance criteria"/>,
        <userStory title="test2" description="short desc" acceptanceCriteria="test acceptance criteria"/>,
    ]
  },
}
</script>

<style>
#app {
  font-family: "Roboto Light", sans-serif;
  background: whitesmoke;
}

.container {
  background: #c9d4d4;
  margin: 30px auto;
  overflow-x: scroll;
  min-height: 300px;
  border: 1px solid steelblue;
  border-radius: 5px;
  white-space: nowrap;
}
.paneContainer {
  background: whitesmoke;
  border: 1px solid black;
  margin: 5px;
  text-align: center;
  max-width: 300px;
  min-width: 300px;
  display:inline-block;

}
#scrumHead {
  margin-top: 5px;
  margin-left: 5px;
}



</style>