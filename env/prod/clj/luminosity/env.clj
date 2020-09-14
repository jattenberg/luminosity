(ns luminosity.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[luminosity started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[luminosity has shut down successfully]=-"))
   :middleware identity})
