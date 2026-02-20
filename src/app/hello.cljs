(ns app.hello
  (:require [reagent.core :as r]))

(defn click-counter [click-count]
  [:div
   "The atom " [:code "click-count"] " has value: "
   @click-count ". "
   [:input {:type "button" :value "Click me!"
            :on-click #(swap! click-count inc)}]])

(def click-count (r/atom 0))

(defn hello []
  [:<>
   [:div {:class "min-h-screen bg-slate-950 text-white font-mono p-8"}

    [:div {:class "inline-flex items-center gap-2 bg-emerald-500/10 border border-emerald-500/30 
                   text-emerald-400 text-xs px-3 py-1 rounded-full mb-8"}
     [:span {:class "w-2 h-2 rounded-full bg-emerald-400 animate-pulse"}]
     [:span "demo is running"]]

    [:h1 {:class "text-5xl font-bold tracking-tight mb-2"}
     "Hello, "
     [:span {:class "text-emerald-400"} "world."]]

    [:p {:class "text-slate-400 text-sm mb-12"}
     "Here's an example of using a component with state:"]

    [:div {:class "max-w-sm bg-slate-900 border border-slate-800 rounded-2xl p-6 
                   shadow-xl shadow-black/40"}

     [:p {:class "text-slate-400 text-xs uppercase tracking-widest mb-4"}
      "Click counter"]

     [:div {:class "flex items-center justify-between"}

      [:span {:class "text-6xl font-bold tabular-nums text-white"}
       @click-count]

      [:button {:class "bg-emerald-500 hover:bg-emerald-400 active:scale-95
                        text-slate-950 font-bold px-5 py-3 rounded-xl
                        transition-all duration-150 cursor-pointer text-sm"
                :on-click #(swap! click-count inc)}
       "Click me"]]

     [:div {:class "mt-6 h-1 bg-slate-800 rounded-full overflow-hidden"}
      [:div {:class "h-full bg-emerald-500 rounded-full transition-all duration-300"
             :style {:width (str (min (* @click-count 10) 100) "%")}}]]]]])
