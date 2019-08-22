(ns ^{:doc "Data structure for all unity events. Must be manually maintained."}
  arcadia.internal.events)

;; from http://docs.unity3d.com/ScriptReference/MonoBehaviour.html
(def events
  '{Awake []
    FixedUpdate []
    LateUpdate []
    OnAnimatorIK [System.Int32]
    OnAnimatorMove []
    OnApplicationFocus [System.Boolean]
    OnApplicationPause [System.Boolean]
    OnApplicationQuit []
    OnAudioFilterRead [|System.Single[]| System.Int32]
    OnBecameInvisible []
    OnBecameVisible []
    OnCollisionEnter [UnityEngine.Collision]
    OnCollisionEnter2D [UnityEngine.Collision2D]
    OnCollisionExit [UnityEngine.Collision]
    OnCollisionExit2D [UnityEngine.Collision2D]
    OnCollisionStay [UnityEngine.Collision]
    OnCollisionStay2D [UnityEngine.Collision2D]
    OnConnectedToServer []
    OnControllerColliderHit [UnityEngine.ControllerColliderHit]
    OnDestroy []
    OnDisable []
    OnDrawGizmos []
    OnDrawGizmosSelected []
    OnEnable []
    OnGUI []
    OnJointBreak [System.Single]
    OnJointBreak2D [UnityEngine.Joint2D]
    OnLevelWasLoaded [System.Int32] ; deprecated
    OnMouseDown []
    OnMouseDrag []
    OnMouseEnter []
    OnMouseExit []
    OnMouseOver []
    OnMouseUp []
    OnMouseUpAsButton []
    OnParticleCollision [UnityEngine.GameObject]
    OnParticleTrigger []
    OnPostRender []
    OnPreCull []
    OnPreRender []
    OnRenderImage [UnityEngine.RenderTexture UnityEngine.RenderTexture]
    OnRenderObject []
    OnServerInitialized []
    OnTransformChildrenChanged []
    OnTransformParentChanged []
    OnTriggerEnter [UnityEngine.Collider]
    OnTriggerEnter2D [UnityEngine.Collider2D]
    OnTriggerExit [UnityEngine.Collider]
    OnTriggerExit2D [UnityEngine.Collider2D]
    OnTriggerStay [UnityEngine.Collider]
    OnTriggerStay2D [UnityEngine.Collider2D]
    OnValidate []
    OnWillRenderObject []
    Reset []
    Start []
    Update []})

;; http://docs.unity3d.com/ScriptReference/EventSystems.EventTrigger.html
(def interface-events
  '{OnBeginDrag [PointerEventData] 
    OnCancel [BaseEventData]
    OnDeselect [BaseEventData]
    OnDrag [PointerEventData]
    OnDrop [PointerEventData]
    OnEndDrag [PointerEventData] 
    OnInitializePotentialDrag [PointerEventData]
    OnMove [AxisEventData]
    OnPointerClick [PointerEventData]
    OnPointerDown [PointerEventData]
    OnPointerEnter [PointerEventData]
    OnPointerExit [PointerEventData]
    OnPointerUp [PointerEventData]
    OnScroll [PointerEventData]
    OnSelect [BaseEventData]
    OnSubmit [BaseEventData]
    OnUpdateSelected [BaseEventData]})

(def special-hooks
  '{})

(def all-events
  (merge events interface-events special-hooks))

