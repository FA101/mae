<script setup>
import { ref, toRefs } from 'vue';
const props = defineProps({
  acao: String,
});

const { acao } = toRefs(props);

</script>

<template>

    <button>
        {{ acao }}
    </button>

</template>


<style scoped>

button {
    padding: 13px 20px;
    background-color: white;
    border-radius: 10px;
    color: #63676C;
    font-weight: bold;
    border: 1px solid  #63676C;
    cursor: pointer;
}

</style>