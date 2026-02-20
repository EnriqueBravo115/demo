(ns app.cards
  "This namespace contains devcards and tests, and is the entrypoint for 
  both 'yarn cards' and 'yarn test'."
  (:require [cljsjs.react]
            [cljsjs.react.dom]
            [devcards.core :refer [start-devcard-ui!]]
            ["jsdom-global" :as jsdom-global]
            ; Import all namespaces with cards here to load them.
            [app.hello-cards]))

(jsdom-global)

(defn ^:export main
  "Start the devcards UI."
  []
  (js/document.body.classList.add "using-devcards")
  (start-devcard-ui!))
