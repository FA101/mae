<script setup>
import { ref, toRefs } from 'vue';
const props = defineProps({
  acao: String,
  icone: Boolean,

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
    background-color: #63676C;
    border-radius: 10px;
    color: white;
    font-weight: bold;
    border: none;
}

</style>