.class public Lg1/d;
.super Landroid/widget/FrameLayout;
.source ""


# instance fields
.field public final b:Landroid/view/accessibility/AccessibilityManager;

.field public final c:Lf0/b;

.field public d:Lg1/c;

.field public e:Lg1/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lu0/a;->g:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    sget-object v1, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/View;->setElevation(F)V

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    const-string p2, "accessibility"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    iput-object p1, p0, Lg1/d;->b:Landroid/view/accessibility/AccessibilityManager;

    new-instance p2, Lg1/d$a;

    invoke-direct {p2, p0}, Lg1/d$a;-><init>(Lg1/d;)V

    iput-object p2, p0, Lg1/d;->c:Lf0/b;

    .line 3
    new-instance v0, Lf0/c;

    invoke-direct {v0, p2}, Lf0/c;-><init>(Lf0/b;)V

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 4
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p1

    invoke-direct {p0, p1}, Lg1/d;->setClickableOrFocusableBasedOnAccessibility(Z)V

    return-void
.end method

.method public static synthetic a(Lg1/d;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lg1/d;->setClickableOrFocusableBasedOnAccessibility(Z)V

    return-void
.end method

.method private setClickableOrFocusableBasedOnAccessibility(Z)V
    .locals 1

    xor-int/lit8 v0, p1, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setClickable(Z)V

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setFocusable(Z)V

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Lg1/d;->e:Lg1/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lg1/b;->onViewAttachedToWindow(Landroid/view/View;)V

    :cond_0
    sget-object v0, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Lg1/d;->e:Lg1/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lg1/b;->onViewDetachedFromWindow(Landroid/view/View;)V

    :cond_0
    iget-object v0, p0, Lg1/d;->b:Landroid/view/accessibility/AccessibilityManager;

    iget-object v1, p0, Lg1/d;->c:Lf0/b;

    if-nez v1, :cond_1

    goto :goto_0

    .line 1
    :cond_1
    new-instance v2, Lf0/c;

    invoke-direct {v2, v1}, Lf0/c;-><init>(Lf0/b;)V

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    :goto_0
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 6

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    iget-object v0, p0, Lg1/d;->d:Lg1/c;

    if-eqz v0, :cond_0

    move-object v1, p0

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lg1/c;->a(Landroid/view/View;IIII)V

    :cond_0
    return-void
.end method

.method public setOnAttachStateChangeListener(Lg1/b;)V
    .locals 0

    iput-object p1, p0, Lg1/d;->e:Lg1/b;

    return-void
.end method

.method public setOnLayoutChangeListener(Lg1/c;)V
    .locals 0

    iput-object p1, p0, Lg1/d;->d:Lg1/c;

    return-void
.end method
