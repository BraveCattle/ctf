.class public Landroidx/constraintlayout/widget/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public final b:Landroidx/constraintlayout/widget/c$d;

.field public final c:Landroidx/constraintlayout/widget/c$c;

.field public final d:Landroidx/constraintlayout/widget/c$b;

.field public final e:Landroidx/constraintlayout/widget/c$e;

.field public f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lq/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/constraintlayout/widget/c$d;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/c$d;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/c$a;->b:Landroidx/constraintlayout/widget/c$d;

    new-instance v0, Landroidx/constraintlayout/widget/c$c;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/c$c;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/c$a;->c:Landroidx/constraintlayout/widget/c$c;

    new-instance v0, Landroidx/constraintlayout/widget/c$b;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/c$b;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    new-instance v0, Landroidx/constraintlayout/widget/c$e;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/c$e;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/c$a;->f:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->h:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->i:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->j:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->k:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->l:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->m:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->n:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->o:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->p:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->q:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->r:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->s:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->t:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->D:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->E:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->F:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->G:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->O:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->x:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->N:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->y:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->K:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->M:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->u:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->z:F

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->v:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->x:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->y:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->z:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iget-object v1, v0, Landroidx/constraintlayout/widget/c$b;->w:Ljava/lang/String;

    iput-object v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->A:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->B:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->P:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->Q:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->D:F

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->S:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->R:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:I

    iget-boolean v1, v0, Landroidx/constraintlayout/widget/c$b;->h0:Z

    iput-boolean v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:Z

    iget-boolean v1, v0, Landroidx/constraintlayout/widget/c$b;->i0:Z

    iput-boolean v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->T:Z

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->T:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->U:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->V:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->W:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->X:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->Y:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->Z:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:F

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->a0:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->C:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->g:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->e:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->f:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->c:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v1, v0, Landroidx/constraintlayout/widget/c$b;->d:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v1, v0, Landroidx/constraintlayout/widget/c$b;->g0:Ljava/lang/String;

    if-eqz v1, :cond_0

    iput-object v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Ljava/lang/String;

    :cond_0
    iget v0, v0, Landroidx/constraintlayout/widget/c$b;->I:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget v0, v0, Landroidx/constraintlayout/widget/c$b;->H:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    return-void
.end method

.method public final b(ILandroidx/constraintlayout/widget/ConstraintLayout$a;)V
    .locals 1

    iput p1, p0, Landroidx/constraintlayout/widget/c$a;->a:I

    iget-object p1, p0, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->h:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->i:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->j:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->k:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->l:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->m:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->n:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->o:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->p:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->q:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->r:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->s:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->t:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->z:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->u:F

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->v:F

    iget-object v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    iput-object v0, p1, Landroidx/constraintlayout/widget/c$b;->w:Ljava/lang/String;

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->x:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->y:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->z:F

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->A:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->B:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->C:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->g:F

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->e:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->f:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->c:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->d:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->D:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->E:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->F:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->G:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->P:F

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->D:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->Q:F

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->S:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->R:I

    iget-boolean v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:Z

    iput-boolean v0, p1, Landroidx/constraintlayout/widget/c$b;->h0:Z

    iget-boolean v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->T:Z

    iput-boolean v0, p1, Landroidx/constraintlayout/widget/c$b;->i0:Z

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->T:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->U:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->V:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->W:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->X:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->Y:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->Z:F

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->a0:F

    iget-object v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Ljava/lang/String;

    iput-object v0, p1, Landroidx/constraintlayout/widget/c$b;->g0:Ljava/lang/String;

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->K:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->M:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->t:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->J:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->v:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->L:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->x:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->O:I

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->y:I

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->N:I

    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v0

    iput v0, p1, Landroidx/constraintlayout/widget/c$b;->H:I

    iget-object p1, p0, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result p2

    iput p2, p1, Landroidx/constraintlayout/widget/c$b;->I:I

    return-void
.end method

.method public final c(ILandroidx/constraintlayout/widget/d$a;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/widget/c$a;->b(ILandroidx/constraintlayout/widget/ConstraintLayout$a;)V

    iget-object p1, p0, Landroidx/constraintlayout/widget/c$a;->b:Landroidx/constraintlayout/widget/c$d;

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->m0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$d;->d:F

    iget-object p1, p0, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->p0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->b:F

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->q0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->c:F

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->r0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->d:F

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->s0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->e:F

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->t0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->f:F

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->u0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->g:F

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->v0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->h:F

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->w0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->i:F

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->x0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->j:F

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->y0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->k:F

    iget v0, p2, Landroidx/constraintlayout/widget/d$a;->o0:F

    iput v0, p1, Landroidx/constraintlayout/widget/c$e;->m:F

    iget-boolean p2, p2, Landroidx/constraintlayout/widget/d$a;->n0:Z

    iput-boolean p2, p1, Landroidx/constraintlayout/widget/c$e;->l:Z

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, Landroidx/constraintlayout/widget/c$a;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/c$a;-><init>()V

    iget-object v1, v0, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    iget-object v2, p0, Landroidx/constraintlayout/widget/c$a;->d:Landroidx/constraintlayout/widget/c$b;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-boolean v3, v2, Landroidx/constraintlayout/widget/c$b;->a:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/c$b;->a:Z

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->c:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->c:I

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/c$b;->b:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/c$b;->b:Z

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->d:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->d:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->e:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->e:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->f:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->f:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->g:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->g:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->h:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->h:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->i:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->i:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->j:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->j:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->k:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->k:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->l:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->l:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->m:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->m:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->n:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->n:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->o:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->o:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->p:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->p:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->q:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->q:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->r:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->r:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->s:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->s:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->t:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->t:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->u:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->u:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->v:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->v:F

    iget-object v3, v2, Landroidx/constraintlayout/widget/c$b;->w:Ljava/lang/String;

    iput-object v3, v1, Landroidx/constraintlayout/widget/c$b;->w:Ljava/lang/String;

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->x:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->x:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->y:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->y:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->z:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->z:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->A:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->A:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->B:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->B:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->C:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->C:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->D:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->D:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->E:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->E:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->F:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->F:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->G:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->G:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->H:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->H:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->I:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->I:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->J:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->J:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->K:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->K:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->L:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->L:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->M:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->M:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->N:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->N:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->O:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->O:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->P:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->P:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->Q:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->Q:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->R:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->R:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->S:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->S:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->T:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->T:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->U:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->U:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->V:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->V:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->W:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->W:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->X:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->X:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->Y:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->Y:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->Z:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->Z:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->a0:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->a0:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->b0:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->b0:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->c0:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->c0:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$b;->d0:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$b;->d0:I

    iget-object v3, v2, Landroidx/constraintlayout/widget/c$b;->g0:Ljava/lang/String;

    iput-object v3, v1, Landroidx/constraintlayout/widget/c$b;->g0:Ljava/lang/String;

    iget-object v3, v2, Landroidx/constraintlayout/widget/c$b;->e0:[I

    if-eqz v3, :cond_0

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v1, Landroidx/constraintlayout/widget/c$b;->e0:[I

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    iput-object v3, v1, Landroidx/constraintlayout/widget/c$b;->e0:[I

    :goto_0
    iget-object v3, v2, Landroidx/constraintlayout/widget/c$b;->f0:Ljava/lang/String;

    iput-object v3, v1, Landroidx/constraintlayout/widget/c$b;->f0:Ljava/lang/String;

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/c$b;->h0:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/c$b;->h0:Z

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/c$b;->i0:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/c$b;->i0:Z

    iget-boolean v2, v2, Landroidx/constraintlayout/widget/c$b;->j0:Z

    iput-boolean v2, v1, Landroidx/constraintlayout/widget/c$b;->j0:Z

    .line 3
    iget-object v1, v0, Landroidx/constraintlayout/widget/c$a;->c:Landroidx/constraintlayout/widget/c$c;

    iget-object v2, p0, Landroidx/constraintlayout/widget/c$a;->c:Landroidx/constraintlayout/widget/c$c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-boolean v3, v2, Landroidx/constraintlayout/widget/c$c;->a:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/c$c;->a:Z

    iget v3, v2, Landroidx/constraintlayout/widget/c$c;->b:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$c;->b:I

    iget-object v3, v2, Landroidx/constraintlayout/widget/c$c;->c:Ljava/lang/String;

    iput-object v3, v1, Landroidx/constraintlayout/widget/c$c;->c:Ljava/lang/String;

    iget v3, v2, Landroidx/constraintlayout/widget/c$c;->d:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$c;->d:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$c;->e:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$c;->e:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$c;->g:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$c;->g:F

    iget v2, v2, Landroidx/constraintlayout/widget/c$c;->f:F

    iput v2, v1, Landroidx/constraintlayout/widget/c$c;->f:F

    .line 5
    iget-object v1, v0, Landroidx/constraintlayout/widget/c$a;->b:Landroidx/constraintlayout/widget/c$d;

    iget-object v2, p0, Landroidx/constraintlayout/widget/c$a;->b:Landroidx/constraintlayout/widget/c$d;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-boolean v3, v2, Landroidx/constraintlayout/widget/c$d;->a:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/c$d;->a:Z

    iget v3, v2, Landroidx/constraintlayout/widget/c$d;->b:I

    iput v3, v1, Landroidx/constraintlayout/widget/c$d;->b:I

    iget v3, v2, Landroidx/constraintlayout/widget/c$d;->d:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$d;->d:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$d;->e:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$d;->e:F

    iget v2, v2, Landroidx/constraintlayout/widget/c$d;->c:I

    iput v2, v1, Landroidx/constraintlayout/widget/c$d;->c:I

    .line 7
    iget-object v1, v0, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    iget-object v2, p0, Landroidx/constraintlayout/widget/c$a;->e:Landroidx/constraintlayout/widget/c$e;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-boolean v3, v2, Landroidx/constraintlayout/widget/c$e;->a:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/c$e;->a:Z

    iget v3, v2, Landroidx/constraintlayout/widget/c$e;->b:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$e;->b:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$e;->c:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$e;->c:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$e;->d:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$e;->d:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$e;->e:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$e;->e:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$e;->f:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$e;->f:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$e;->g:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$e;->g:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$e;->h:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$e;->h:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$e;->i:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$e;->i:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$e;->j:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$e;->j:F

    iget v3, v2, Landroidx/constraintlayout/widget/c$e;->k:F

    iput v3, v1, Landroidx/constraintlayout/widget/c$e;->k:F

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/c$e;->l:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/c$e;->l:Z

    iget v2, v2, Landroidx/constraintlayout/widget/c$e;->m:F

    iput v2, v1, Landroidx/constraintlayout/widget/c$e;->m:F

    .line 9
    iget v1, p0, Landroidx/constraintlayout/widget/c$a;->a:I

    iput v1, v0, Landroidx/constraintlayout/widget/c$a;->a:I

    return-object v0
.end method
