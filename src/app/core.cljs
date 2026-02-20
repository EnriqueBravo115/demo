(ns app.core
  (:require [reagent.core :as r]
            [app.hello :refer [hello]]))

(defn ^:dev/after-load render
  "Render the toplevel component"
  []
  (r/render [hello] (.getElementById js/document "app")))

(defn ^:export main
  []
  (render))
